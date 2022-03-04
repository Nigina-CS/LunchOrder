package com.example.lunch.entity.meal;

import com.example.lunch.entity.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "menu",schema = "meal")
@Entity
public class Menu extends Auditable {
    private Date date ;
    private Long mealId;

}
