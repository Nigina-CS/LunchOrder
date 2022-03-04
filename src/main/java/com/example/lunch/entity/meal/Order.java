package com.example.lunch.entity.meal;

import com.example.lunch.entity.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order extends Auditable {
    private Date date;
    private boolean rejected;
    private boolean received;
    private Long userId;
    private Long mealId;
}
