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
        forEachMainBoard(pcPartDTOList, mainBoardList);

        List<CPU> cpuList = cpuService.findAll();
        forEachCPU(pcPartDTOList, cpuList);

        List<RAM> ramList = ramService.findAll();
        forEachRAM(pcPartDTOList, ramList);

        List<PSU> psuList = psuService.findAll();
        forEachPSU(pcPartDTOList, psuList);

        List<VGA> vgaList = vgaService.findAll();
        forEachVGA(pcPartDTOList, vgaList);

        List<HDD> hddList = hddService.findAll();
        forEachHDD(pcPartDTOList, hddList);

        List<SSD> ssdList = ssdService.findAll();
        forEachSSD(pcPartDTOList, ssdList);

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

    @GetMapping("/search")
    public List<PCPartDTO> search(@RequestParam("type") String type, @RequestParam("query") String query) {

        List<PCPartDTO> pcPartDTOList = new ArrayList<>();
        List<MainBoard> mainBoardList;
        List<CPU> cpuList;
        List<RAM> ramList;
        List<VGA> vgaList;
        List<PSU> psuList;
        List<HDD> hddList;
        List<SSD> ssdList;

        switch (type) {
            case "mainboard":
                if (!"".equals(query)) {
                    mainBoardList = mainBoardService.findByName(query);
                } else {
                    mainBoardList = mainBoardService.findAll();
                }
                forEachMainBoard(pcPartDTOList, mainBoardList);
                break;
            case "cpu":
                if (!"".equals(query)) {
                    cpuList = cpuService.findByName(query);
                } else {
                    cpuList = cpuService.findAll();
                }
                forEachCPU(pcPartDTOList, cpuList);
                break;
            case "ram":
                if (!"".equals(query)) {
                    ramList = ramService.findByName(query);
                } else {
                    ramList = ramService.findAll();
                }
                forEachRAM(pcPartDTOList, ramList);
                break;
            case "vga":
                if (!"".equals(query)) {
                    vgaList = vgaService.findByName(query);
                } else {
                    vgaList = vgaService.findAll();
                }
                forEachVGA(pcPartDTOList, vgaList);
                break;
            case "psu":
                if (!"".equals(query)) {
                    psuList = psuService.findByName(query);
                } else {
                    psuList = psuService.findAll();
                }
                forEachPSU(pcPartDTOList, psuList);
                break;
            case "hdd":
                if (!"".equals(query)) {
                    hddList = hddService.findByName(query);
                } else {
                    hddList = hddService.findAll();
                }
                forEachHDD(pcPartDTOList, hddList);
                break;
            case "ssd":
                if (!"".equals(query)) {
                    ssdList = ssdService.findByName(query);
                } else {
                    ssdList = ssdService.findAll();
                }
                forEachSSD(pcPartDTOList, ssdList);
                break;
            case "":
                if (!"".equals(query)) {
                    mainBoardList = mainBoardService.findByName(query);
                    forEachMainBoard(pcPartDTOList, mainBoardList);

                    cpuList = cpuService.findByName(query);
                    forEachCPU(pcPartDTOList, cpuList);
                    ramList = ramService.findByName(query);
                    forEachRAM(pcPartDTOList, ramList);

                    psuList = psuService.findByName(query);
                    forEachPSU(pcPartDTOList, psuList);

                    vgaList = vgaService.findByName(query);
                    forEachVGA(pcPartDTOList, vgaList);

                    hddList = hddService.findByName(query);
                    forEachHDD(pcPartDTOList, hddList);

                    ssdList = ssdService.findByName(query);
                    forEachSSD(pcPartDTOList, ssdList);
                } else {
                    mainBoardList = mainBoardService.findAll();
                    forEachMainBoard(pcPartDTOList, mainBoardList);

                    cpuList = cpuService.findAll();
                    forEachCPU(pcPartDTOList, cpuList);

                    ramList = ramService.findAll();
                    forEachRAM(pcPartDTOList, ramList);

                    psuList = psuService.findAll();
                    forEachPSU(pcPartDTOList, psuList);

                    vgaList = vgaService.findAll();
                    forEachVGA(pcPartDTOList, vgaList);

                    hddList = hddService.findAll();
                    forEachHDD(pcPartDTOList, hddList);

                    ssdList = ssdService.findAll();
                    forEachSSD(pcPartDTOList, ssdList);
                }
                break;
        }
        return pcPartDTOList;
    }

    private void forEachMainBoard(List<PCPartDTO> dtoList, List<MainBoard> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("mainboard");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }

    private void forEachCPU(List<PCPartDTO> dtoList, List<CPU> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("cpu");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }

    private void forEachRAM(List<PCPartDTO> dtoList, List<RAM> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("ram");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }

    private void forEachPSU(List<PCPartDTO> dtoList, List<PSU> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("psu");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }

    private void forEachVGA(List<PCPartDTO> dtoList, List<VGA> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("vga");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }

    private void forEachHDD(List<PCPartDTO> dtoList, List<HDD> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("hdd");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }

    private void forEachSSD(List<PCPartDTO> dtoList, List<SSD> oList) {
        oList.forEach(o -> {
            PCPartDTO pcPartDTO = new PCPartDTO();
            pcPartDTO.setId(o.getId());
            pcPartDTO.setType("ssd");
            pcPartDTO.setName(o.getName());
            pcPartDTO.setPrice(o.getPrice());
            pcPartDTO.setDescription(o.getDescription());
            dtoList.add(pcPartDTO);
        });
    }
}
