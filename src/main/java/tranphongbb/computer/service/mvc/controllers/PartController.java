package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import tranphongbb.computer.service.mvc.dto.PartDto;
import tranphongbb.computer.service.mvc.dto.PartTypeDto;
import tranphongbb.computer.service.mvc.entity.Part;
import tranphongbb.computer.service.mvc.entity.PartType;
import tranphongbb.computer.service.mvc.models.PartDtoWithPaging;
import tranphongbb.computer.service.mvc.models.UserDetailsImpl;
import tranphongbb.computer.service.mvc.services.PartService;
import tranphongbb.computer.service.mvc.services.PartTypeService;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/endpoint/part")
@RequiredArgsConstructor
public class PartController {

    private final PartService partService;
    private final PartTypeService partTypeService;

    private PartDtoWithPaging getPartDtoWithPaging(List<PartDto> partDtoList, Page<Part> parts) {
        parts.getContent().forEach(part -> {
            PartDto partDto = new PartDto();
            partDto.setId(part.getId());
            partDto.setPartTypeId(part.getPartTypeId());
            partDto.setName(part.getName());
            partDto.setType(part.getPartType().getType());
            partDto.setPrice(part.getPrice());
            partDto.setDescription(part.getDescription());
            partDtoList.add(partDto);
        });

        return new PartDtoWithPaging(partDtoList, parts.getSize(), parts.getNumber(), parts.getTotalPages(), parts.getTotalElements());
    }

    @GetMapping("/type")
    public List<PartTypeDto> findAllPartType() {
        List<PartTypeDto> partTypeDtoList = new ArrayList<>();
        List<PartType> all = partTypeService.findAll();

        all.forEach(partType -> {
            PartTypeDto partTypeDto = new PartTypeDto();
            partTypeDto.setType(partType.getType());
            partTypeDto.setCheck(partType.isCheck());
            partTypeDto.setParentType(partType.getParentType());
            partTypeDto.setName(partType.getName());
            partTypeDto.setDescription(partType.getDescription());
            partTypeDtoList.add(partTypeDto);
        });

        return partTypeDtoList;
    }

    @GetMapping
    public PartDtoWithPaging findAll(Pageable pageable) {
        List<PartDto> partDtoList = new ArrayList<>();
        Page<Part> all = partService.findAllWithPaging(pageable);
        return getPartDtoWithPaging(partDtoList, all);
    }

    @PostMapping
    public Part createNewPCPart(@RequestBody PartDto partDto) {

        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int id = userDetails.getId();

        Part part = new Part();
        part.setName(partDto.getName());
        PartType byType = partTypeService.findByType(partDto.getType());
        part.setPartTypeId(byType.getId());
        part.setPrice(partDto.getPrice());
        part.setDescription(partDto.getDescription());
        part.setCreatedBy(id);
        return partService.save(part);
    }

    @GetMapping("/{type}/{id}")
    public PartDto findOneByType(@PathVariable("type") String type, @PathVariable("id") int id) {
        PartDto partDto = new PartDto();
        Part byId = partService.findById(id);

        if (byId != null) {
            partDto.setId(byId.getId());
            partDto.setName(byId.getName());
            partDto.setPartTypeId(byId.getPartTypeId());
            partDto.setType(byId.getPartType().getType());
            partDto.setPrice(byId.getPrice());
            partDto.setDescription(byId.getDescription());
            return partDto;
        }
        return null;
    }

    @PutMapping
    public Part updateOne(@RequestBody PartDto updated) {

        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int id = userDetails.getId();

        Part part = partService.findById(updated.getId());
        part.setName(updated.getName());
        PartType byType = partTypeService.findByType(updated.getType());
        part.setPartTypeId(byType.getId());
        part.setPrice(updated.getPrice());
        part.setDescription(updated.getDescription());
        part.setUpdatedBy(id);
        return partService.save(part);
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable("id") int id) {
        partService.deleteById(id);
    }

    @GetMapping("/search")
    public PartDtoWithPaging search(Pageable pageable, @RequestParam("type") String type, @RequestParam("query") String query) {
        List<PartDto> partDtoList = new ArrayList<>();
        Page<Part> parts = partService.searchPart(pageable, type, query);
        return getPartDtoWithPaging(partDtoList, parts);
    }
}
