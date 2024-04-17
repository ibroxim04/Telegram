package uz.pdp.backend.service;

import uz.pdp.backend.models.BaseModel;

import java.util.List;

public interface BaseService<M extends BaseModel> {
    void create(M m);

    M get(String id);

    List<M> getList();

    void update(M newM);

    void delete(String id);
}
