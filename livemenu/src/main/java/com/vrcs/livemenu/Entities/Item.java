package com.vrcs.livemenu.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
@SuperBuilder
@Table(name = "items")
public class Item extends BaseEntity implements Comparable<Item>{
    @Column(nullable = false)
    private int price;

    @ManyToOne
    // @JsonManagedReference
    private ItemCategory itemCategory;

    @Override
    public int compareTo(Item o) {
        return this.itemCategory.getPriority() - o.getItemCategory().getPriority();
    }
}
