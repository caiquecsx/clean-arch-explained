package com.caiquecsx.mycleanarchitecture.infrastructure.shared;

import java.io.Serializable;

public interface Converter <R extends Serializable, E extends Serializable>{
    default E mapToEntity(final R entity) {
        throw new UnsupportedOperationException();
    }

    default R mapToDatabase(final E entity) {
        throw new UnsupportedOperationException();
    }
}
