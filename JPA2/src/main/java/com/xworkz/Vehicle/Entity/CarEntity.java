package com.xworkz.Vehicle.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
@NamedQuery(name="EntityByName",query = "select entity from CarEntity entity where entity.carName =: Name ")
@NamedQuery(name="EntityByNameAndType",query = "select entity from CarEntity entity where entity.carName =:name and entity.carType =: type ")
//@NamedQuery(name="EntityByNameAndColor",query = "select entity from CarEntity entity where entity.name =:name and entity.color=:color ")
//@NamedQuery(name="EntityByPrice",query = "select entity from CarEntity entity where entity.price =: price ")

public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Car_Name")
    private String carName;

    @Column(name = "Car_Color")
    private String carColor;

    @Column(name = "Car_Price")
    private int carPrice;

    @Column(name = "Car_Type")
    private String carType;

    public CarEntity(String carName, String carColor, int carPrice, String carType) {
        this.carName = carName;
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carPrice=" + carPrice +
                ", carType='" + carType + '\'' +
                '}';
    }
}
