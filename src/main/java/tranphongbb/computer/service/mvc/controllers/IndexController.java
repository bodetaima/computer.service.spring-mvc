package tranphongbb.computer.service.mvc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tranphongbb.computer.service.mvc.dto.IndexDTO;

@CrossOrigin
@RestController
@RequestMapping("/endpoint/index")
@RequiredArgsConstructor
public class IndexController {

    @GetMapping
    public IndexDTO getIndex() {

        return new IndexDTO("It's working!");
    }
}
