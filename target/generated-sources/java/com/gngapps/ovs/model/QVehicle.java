package com.gngapps.ovs.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVehicle is a Querydsl query type for Vehicle
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVehicle extends EntityPathBase<Vehicle> {

    private static final long serialVersionUID = -22244356L;

    public static final QVehicle vehicle = new QVehicle("vehicle");

    public final StringPath energySource = createString("energySource");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath manufacturer = createString("manufacturer");

    public final StringPath model = createString("model");

    public final StringPath price = createString("price");

    public final DateTimePath<java.util.Date> publishDate = createDateTime("publishDate", java.util.Date.class);

    public QVehicle(String variable) {
        super(Vehicle.class, forVariable(variable));
    }

    public QVehicle(Path<? extends Vehicle> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVehicle(PathMetadata metadata) {
        super(Vehicle.class, metadata);
    }

}

