package tech.talci.sowisoassignment.services;

public interface CrudService<T, ID> {

    T save(T  object);
}
