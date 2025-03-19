package com.vrcs.livemenu.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class ItemCategory extends BaseEntity implements Comparable<ItemCategory> {

    @Column(nullable = false, unique = true)
    private int priority;

    @OneToMany(mappedBy = "itemCategory")
    @JsonBackReference
    private List<Item> items;

    @Override
    public int compareTo(ItemCategory o) {
        return this.priority - o.getPriority();
    }
}

