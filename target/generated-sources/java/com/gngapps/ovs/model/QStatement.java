package com.gngapps.ovs.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStatement is a Querydsl query type for Statement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStatement extends EntityPathBase<Statement> {

    private static final long serialVersionUID = -2999745L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStatement statement = new QStatement("statement");

    public final DateTimePath<org.joda.time.DateTime> creationDate = createDateTime("creationDate", org.joda.time.DateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QUser user;

    public QStatement(String variable) {
        this(Statement.class, forVariable(variable), INITS);
    }

    public QStatement(Path<? extends Statement> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStatement(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStatement(PathMetadata metadata, PathInits inits) {
        this(Statement.class, metadata, inits);
    }

    public QStatement(Class<? extends Statement> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

