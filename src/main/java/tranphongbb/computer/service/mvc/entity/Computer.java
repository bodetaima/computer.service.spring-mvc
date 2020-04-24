package tranphongbb.computer.service.mvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import tranphongbb.computer.service.mvc.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "computers")
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "computer_model")
    private String computerModel;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "cpu_id")
    private int cpuId;

    @Column(name = "ram_id")
    private int ramId;

    @Column(name = "mainboard_id")
    private int mainboardId;

    @Column(name = "vga_id")
    private int vgaId;

    @Column(name = "hdd_id")
    private int hddId;

    @Column(name = "ssd_id")
    private int ssdId;

    @Column(name = "psu_id")
    private int psuId;
}
