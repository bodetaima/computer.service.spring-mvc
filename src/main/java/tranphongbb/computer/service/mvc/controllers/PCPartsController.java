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
            pcPartDTO.setType("mainboard");
            pcPartDTO.setName(mb.getName());
            pcPartDTO.setPrice(mb.getPrice());
            pcPartDTO.setDescription(mb.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<CPU> cpuList = cpuService.findAll();
        cpuList.forEach(cpu -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(cpu.getId());
            pcPartDTO.setType("cpu");
            pcPartDTO.setName(cpu.getName());
            pcPartDTO.setPrice(cpu.getPrice());
            pcPartDTO.setDescription(cpu.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<RAM> ramList = ramService.findAll();
        ramList.forEach(ram -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(ram.getId());
            pcPartDTO.setType("ram");
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
            pcPartDTO.setType("psu");
            pcPartDTO.setName(psu.getName());
            pcPartDTO.setPrice(psu.getPrice());
            pcPartDTO.setDescription(psu.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<HDD> hddList = hddService.findAll();
        hddList.forEach(hdd -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(hdd.getId());
            pcPartDTO.setType("hdd");
            pcPartDTO.setName(hdd.getName());
            pcPartDTO.setPrice(hdd.getPrice());
            pcPartDTO.setDescription(hdd.getDescription());
            pcPartDTOList.add(pcPartDTO);
        });

        List<SSD> ssdList = ssdService.findAll();
        ssdList.forEach(ssd -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(ssd.getId());
            pcPartDTO.setType("ssd");
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
                    pcPartDTO.setType("mainboard");
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
                    pcPartDTO.setType("cpu");
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
                    pcPartDTO.setType("ram");
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
                    pcPartDTO.setType("vga");
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
                    pcPartDTO.setType("psu");
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
                    pcPartDTO.setType("hdd");
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
                    pcPartDTO.setType("ssd");
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
            case "mainboard":
                MainBoard mainBoard = new MainBoard();
                mainBoard.setName(pcPartDTO.getName());
                mainBoard.setPrice(pcPartDTO.getPrice());
                mainBoard.setDescription(pcPartDTO.getDescription());
                mainBoardService.save(mainBoard);
                break;
            case "cpu":
                CPU cpu = new CPU();
                cpu.setName(pcPartDTO.getName());
                cpu.setPrice(pcPartDTO.getPrice());
                cpu.setDescription(pcPartDTO.getDescription());
                cpuService.save(cpu);
                break;
            case "ram":
                RAM ram = new RAM();
                ram.setName(pcPartDTO.getName());
                ram.setPrice(pcPartDTO.getPrice());
                ram.setDescription(pcPartDTO.getDescription());
                ramService.save(ram);
                break;
            case "vga":
                VGA vga = new VGA();
                vga.setName(pcPartDTO.getName());
                vga.setPrice(pcPartDTO.getPrice());
                vga.setDescription(vga.getDescription());
                vgaService.save(vga);
                break;
            case "psu":
                PSU psu = new PSU();
                psu.setName(pcPartDTO.getName());
                psu.setPrice(pcPartDTO.getPrice());
                psu.setDescription(pcPartDTO.getDescription());
                psuService.save(psu);
                break;
            case "hdd":
                HDD hdd = new HDD();
                hdd.setName(pcPartDTO.getName());
                hdd.setPrice(pcPartDTO.getPrice());
                hdd.setDescription(pcPartDTO.getDescription());
                hddService.save(hdd);
                break;
            case "ssd":
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

    @GetMapping("/{type}/{id}")
    public PCPartDTO findOneByType(@PathVariable("type") String type, @PathVariable("id") int id) {
        PCPartDTO pcPartDTO = new PCPartDTO();
        switch (type) {
            case "mainboard":
                MainBoard mbById = mainBoardService.findById(id);
                pcPartDTO.setId(mbById.getId());
                pcPartDTO.setName(mbById.getName());
                pcPartDTO.setPrice(mbById.getPrice());
                pcPartDTO.setDescription(mbById.getDescription());
                pcPartDTO.setType("mainboard");
                break;
            case "cpu":
                CPU cpuById = cpuService.findById(id);
                pcPartDTO.setId(cpuById.getId());
                pcPartDTO.setName(cpuById.getName());
                pcPartDTO.setPrice(cpuById.getPrice());
                pcPartDTO.setDescription(cpuById.getDescription());
                pcPartDTO.setType("cpu");
                break;
            case "ram":
                RAM ramById = ramService.findById(id);
                pcPartDTO.setId(ramById.getId());
                pcPartDTO.setName(ramById.getName());
                pcPartDTO.setPrice(ramById.getPrice());
                pcPartDTO.setDescription(ramById.getDescription());
                pcPartDTO.setType("ram");
                break;
            case "vga":
                VGA vgaById = vgaService.findById(id);
                pcPartDTO.setId(vgaById.getId());
                pcPartDTO.setName(vgaById.getName());
                pcPartDTO.setPrice(vgaById.getPrice());
                pcPartDTO.setDescription(vgaById.getDescription());
                pcPartDTO.setType("vga");
                break;
            case "psu":
                PSU psuById = psuService.findById(id);
                pcPartDTO.setId(psuById.getId());
                pcPartDTO.setName(psuById.getName());
                pcPartDTO.setPrice(psuById.getPrice());
                pcPartDTO.setDescription(psuById.getDescription());
                pcPartDTO.setType("psu");
                break;
            case "hdd":
                HDD hddById = hddService.findById(id);
                pcPartDTO.setId(hddById.getId());
                pcPartDTO.setName(hddById.getName());
                pcPartDTO.setPrice(hddById.getPrice());
                pcPartDTO.setDescription(hddById.getDescription());
                pcPartDTO.setType("hdd");
                break;
            case "ssd":
                SSD ssdById = ssdService.findById(id);
                pcPartDTO.setId(ssdById.getId());
                pcPartDTO.setName(ssdById.getName());
                pcPartDTO.setPrice(ssdById.getPrice());
                pcPartDTO.setDescription(ssdById.getDescription());
                pcPartDTO.setType("ssd");
                break;
        }
        return pcPartDTO;
    }

    @PutMapping
    public PCPartDTO updateOne(@RequestBody PCPartDTO updated) {

        switch (updated.getType()) {
            case "mainboard":
                MainBoard byId = mainBoardService.findById(updated.getId());
                byId.setName(updated.getName());
                byId.setPrice(updated.getPrice());
                byId.setDescription(updated.getDescription());
                mainBoardService.save(byId);
                break;
            case "cpu":
                CPU cpu = cpuService.findById(updated.getId());
                cpu.setName(updated.getName());
                cpu.setPrice(updated.getPrice());
                cpu.setDescription(updated.getDescription());
                cpuService.save(cpu);
                break;
            case "RAM":
                RAM ram = ramService.findById(updated.getId());
                ram.setName(updated.getName());
                ram.setPrice(updated.getPrice());
                ram.setDescription(updated.getDescription());
                ramService.save(ram);
                break;
            case "vga":
                VGA vga = vgaService.findById(updated.getId());
                vga.setName(updated.getName());
                vga.setPrice(updated.getPrice());
                vga.setDescription(vga.getDescription());
                vgaService.save(vga);
                break;
            case "psu":
                PSU psu = new PSU();
                psu.setName(updated.getName());
                psu.setPrice(updated.getPrice());
                psu.setDescription(updated.getDescription());
                psuService.save(psu);
                break;
            case "hdd":
                HDD hdd = hddService.findById(updated.getId());
                hdd.setName(updated.getName());
                hdd.setPrice(updated.getPrice());
                hdd.setDescription(updated.getDescription());
                hddService.save(hdd);
                break;
            case "ssd":
                SSD ssd = ssdService.findById(updated.getId());
                ssd.setName(updated.getName());
                ssd.setPrice(updated.getPrice());
                ssd.setDescription(updated.getDescription());
                ssdService.save(ssd);
                break;
            default:
                return updated;
        }
        return updated;
    }

    @DeleteMapping("/{type}/{id}")
    public void deleteOne(@PathVariable("type") String type, @PathVariable("id") int id) {

        switch (type) {
            case "mainboard":
                mainBoardService.deleteById(id);
                break;
            case "cpu":
                cpuService.deleteById(id);
                break;
            case "ram":
                ramService.deleteById(id);
                break;
            case "vga":
                vgaService.deleteById(id);
                break;
            case "psu":
                psuService.deleteById(id);
                break;
            case "hdd":
                hddService.deleteById(id);
                break;
            case "ssd":
                ssdService.deleteById(id);
                break;
        }
    }
}
