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

/*
 * Made by Pt. Copyright (c) 3/2020.
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "order_service_plan_operations")
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderServicePlanOperation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;

    @Column(name = "ospo_code")
    private String OSPOCode;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "service_plan_operation_id")
    private String servicePlanOperationId;
}
