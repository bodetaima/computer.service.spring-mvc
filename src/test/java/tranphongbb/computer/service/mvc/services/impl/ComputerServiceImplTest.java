package tranphongbb.computer.service.mvc.services.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tranphongbb.computer.service.mvc.entity.Computer;
import tranphongbb.computer.service.mvc.repositories.ComputerRepository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ComputerServiceImplTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ComputerRepository repo;

    @Test
    void findAll() {

        Computer computer1 = new Computer();
        computer1.setName("B150M");

        Computer computer2 = new Computer();
        computer2.setName("B450M");

        entityManager.persist(computer1);
        entityManager.persist(computer2);
        entityManager.flush();

        List<Computer> all = repo.findAll();
        assertThat(all, hasSize(2));
    }

    @Test
    void findById() {

        Computer computer = new Computer();

        entityManager.persist(computer);
        entityManager.flush();

        repo.findById(computer.getId()).ifPresent(byId -> assertThat(byId.getId(), is(computer.getId())));
    }

    @Test
    void saveAll() {

        List<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        computers.add(computer1);
        computers.add(computer2);

        List<Computer> computerList = repo.saveAll(computers);

        assertThat(computerList, hasSize(2));


    }

    @Test
    void save() {
        Computer computer = new Computer();

        Computer save = repo.save(computer);

        assertThat(save.getId(), is(computer.getId()));
    }

    @Test
    void delete() {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        entityManager.persist(computer1);
        entityManager.persist(computer2);
        entityManager.flush();

        repo.delete(computer1);

        assertThat(repo.count(), is(1L));
    }

    @Test
    void deleteById() {

        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        entityManager.persist(computer1);
        entityManager.persist(computer2);
        entityManager.flush();

        repo.deleteById(computer1.getId());

        assertThat(repo.count(), is(1L));
    }
}