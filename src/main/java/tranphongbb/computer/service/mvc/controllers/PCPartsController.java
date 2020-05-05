package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.dto.PCPartDTO;
import tranphongbb.computer.service.mvc.entity.pc.*;
import tranphongbb.computer.service.mvc.services.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/endpoint/part")
@RequiredArgsConstructor
public class PCPartsController {

    private final CPUService cpuService;
    private final RAMService ramService;
    private final MainBoardService mainBoardService;
    private final VGAService vgaService;
    private final PSUService psuService;
    private final HDDService hddService;
    private final SSDService ssdService;

    @GetMapping
    public List<PCPartDTO> findAllPCParts() {

        List<PCPartDTO> pcPartDTOList = new ArrayList<>();

        List<MainBoard> mainBoardList = mainBoardService.findAll();
        mainBoardList.forEach(mb -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(mb.getId());
            pcPartDTO.setType("MAINBOARD");
            pcPartDTO.setName(mb.getName());
            pcPartDTO.setPrice(mb.getPrice());
            pcPartDTO.setDescription(mb.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<CPU> cpuList = cpuService.findAll();
        cpuList.forEach(cpu -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(cpu.getId());
            pcPartDTO.setType("CPU");
            pcPartDTO.setName(cpu.getName());
            pcPartDTO.setPrice(cpu.getPrice());
            pcPartDTO.setDescription(cpu.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<RAM> ramList = ramService.findAll();
        ramList.forEach(ram -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(ram.getId());
            pcPartDTO.setType("RAM");
            pcPartDTO.setName(ram.getName());
            pcPartDTO.setPrice(ram.getPrice());
            pcPartDTO.setDescription(ram.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<VGA> vgaList = vgaService.findAll();
        vgaList.forEach(vga -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(vga.getId());
            pcPartDTO.setType("VGA");
            pcPartDTO.setName(vga.getName());
            pcPartDTO.setPrice(vga.getPrice());
            pcPartDTO.setDescription(vga.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<PSU> psuList = psuService.findAll();
        psuList.forEach(psu -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(psu.getId());
            pcPartDTO.setType("PSU");
            pcPartDTO.setName(psu.getName());
            pcPartDTO.setPrice(psu.getPrice());
            pcPartDTO.setDescription(psu.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<HDD> hddList = hddService.findAll();
        hddList.forEach(hdd -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(hdd.getId());
            pcPartDTO.setType("HDD");
            pcPartDTO.setName(hdd.getName());
            pcPartDTO.setPrice(hdd.getPrice());
            pcPartDTO.setDescription(hdd.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<SSD> ssdList = ssdService.findAll();
        ssdList.forEach(ssd -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(ssd.getId());
            pcPartDTO.setType("SSD");
            pcPartDTO.setName(ssd.getName());
            pcPartDTO.setPrice(ssd.getPrice());
            pcPartDTO.setDescription(ssd.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        return pcPartDTOList;
    }

    @GetMapping("/{type}")
    public List<PCPartDTO> findPCPartByType(@PathVariable("type") String type) {
        List<PCPartDTO> pcPartDTOList = new ArrayList<>();
        switch (type) {
            case "mainboard":
                List<MainBoard> mainBoardList = mainBoardService.findAll();
                mainBoardList.forEach(mb -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(mb.getName());
                    pcPartDTO.setType("MAINBOARD");
                    pcPartDTO.setPrice(mb.getPrice());
                    pcPartDTO.setDescription(mb.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            case "cpu":
                List<CPU> cpuList = cpuService.findAll();
                cpuList.forEach(cpu -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(cpu.getName());
                    pcPartDTO.setType("CPU");
                    pcPartDTO.setPrice(cpu.getPrice());
                    pcPartDTO.setDescription(cpu.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            case "ram":
                List<RAM> ramList = ramService.findAll();
                ramList.forEach(ram -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(ram.getName());
                    pcPartDTO.setType("RAM");
                    pcPartDTO.setPrice(ram.getPrice());
                    pcPartDTO.setDescription(ram.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            case "vga":
                List<VGA> vgaList = vgaService.findAll();
                vgaList.forEach(vga -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(vga.getName());
                    pcPartDTO.setType("VGA");
                    pcPartDTO.setPrice(vga.getPrice());
                    pcPartDTO.setDescription(vga.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            case "psu":
                List<PSU> psuList = psuService.findAll();
                psuList.forEach(psu -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(psu.getName());
                    pcPartDTO.setType("PSU");
                    pcPartDTO.setPrice(psu.getPrice());
                    pcPartDTO.setDescription(psu.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            case "hdd":
                List<HDD> hddList = hddService.findAll();
                hddList.forEach(hdd -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(hdd.getName());
                    pcPartDTO.setType("HDD");
                    pcPartDTO.setPrice(hdd.getPrice());
                    pcPartDTO.setDescription(hdd.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            case "ssd":
                List<SSD> ssdList = ssdService.findAll();
                ssdList.forEach(ssd -> {
                    PCPartDTO pcPartDTO = new PCPartDTO();
                    pcPartDTO.setName(ssd.getName());
                    pcPartDTO.setType("SSD");
                    pcPartDTO.setPrice(ssd.getPrice());
                    pcPartDTO.setDescription(ssd.getDescription());
                    pcPartDTOList.add(pcPartDTO);
                });
                break;
            default:
                return pcPartDTOList;
        }
        return pcPartDTOList;
    }

    @PostMapping
    public PCPartDTO createNewPCPart(@RequestBody PCPartDTO pcPartDTO) {

        switch (pcPartDTO.getType()) {
            case "MAINBOARD":
                MainBoard mainBoard = new MainBoard();
                mainBoard.setName(pcPartDTO.getName());
                mainBoard.setPrice(pcPartDTO.getPrice());
                mainBoard.setDescription(pcPartDTO.getDescription());
                mainBoardService.save(mainBoard);
                break;
            case "CPU":
                CPU cpu = new CPU();
                cpu.setName(pcPartDTO.getName());
                cpu.setPrice(pcPartDTO.getPrice());
                cpu.setDescription(pcPartDTO.getDescription());
                cpuService.save(cpu);
                break;
            case "RAM":
                RAM ram = new RAM();
                ram.setName(pcPartDTO.getName());
                ram.setPrice(pcPartDTO.getPrice());
                ram.setDescription(pcPartDTO.getDescription());
                ramService.save(ram);
                break;
            case "VGA":
                VGA vga = new VGA();
                vga.setName(pcPartDTO.getName());
                vga.setPrice(pcPartDTO.getPrice());
                vga.setDescription(vga.getDescription());
                vgaService.save(vga);
                break;
            case "PSU":
                PSU psu = new PSU();
                psu.setName(pcPartDTO.getName());
                psu.setPrice(pcPartDTO.getPrice());
                psu.setDescription(pcPartDTO.getDescription());
                psuService.save(psu);
                break;
            case "HDD":
                HDD hdd = new HDD();
                hdd.setName(pcPartDTO.getName());
                hdd.setPrice(pcPartDTO.getPrice());
                hdd.setDescription(pcPartDTO.getDescription());
                hddService.save(hdd);
                break;
            case "SSD":
                SSD ssd = new SSD();
                ssd.setName(pcPartDTO.getName());
                ssd.setPrice(pcPartDTO.getPrice());
                ssd.setDescription(pcPartDTO.getDescription());
                ssdService.save(ssd);
                break;
            default:
                return pcPartDTO;
        }
        return pcPartDTO;
    }
}
