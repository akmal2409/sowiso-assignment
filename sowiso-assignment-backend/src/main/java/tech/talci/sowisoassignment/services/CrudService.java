package tech.talci.sowisoassignment.services;

import java.util.List;

public interface CrudService<T, ID> {

    T save(T  object);
}
