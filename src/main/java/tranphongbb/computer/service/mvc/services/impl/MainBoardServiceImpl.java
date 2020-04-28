package tranphongbb.computer.service.mvc.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tranphongbb.computer.service.mvc.entity.pc.MainBoard;
import tranphongbb.computer.service.mvc.repositories.MainBoardRepository;
import tranphongbb.computer.service.mvc.services.MainBoardService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainBoardServiceImpl implements MainBoardService {

    private final MainBoardRepository repo;

    @Override
    public List<MainBoard> findAll() {
        return repo.findAll();
    }

    @Override
    public MainBoard findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<MainBoard> saveAll(List<MainBoard> list) {
        return repo.saveAll(list);
    }

    @Override
    public MainBoard save(MainBoard object) {
        return repo.saveAndFlush(object);
    }

    @Override
    public MainBoard delete(MainBoard object) {
        if (object != null) {
            object.setDeleted(true);
            return repo.save(object);
        } else {
            return null;
        }
    }

    @Override
    public MainBoard deleteById(int id) {
        MainBoard byId = findById(id);
        if (byId != null) {
            byId.setDeleted(true);
            return repo.save(byId);
        } else {
            return null;
        }
    }
}
