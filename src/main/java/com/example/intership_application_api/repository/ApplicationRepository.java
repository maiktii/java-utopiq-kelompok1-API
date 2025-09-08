package com.example.intership_application_api.repository;

import com.example.intership_application_api.entity.Application;
import com.example.intership_application_api.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ApplicationRepository {
    private final Map<Long, Application> data = new ConcurrentHashMap<>();
    private final AtomicLong seq = new AtomicLong(0);

    public ApplicationRepository(){
        saveApplication(new Application(null, 1, 1, "back-end", "www.test.com"));
        saveApplication(new Application(null, 2, 2, "front-end", "www.test1.com"));
    }

    public Application saveApplication(Application ev) {
        if (ev.getId() == null) ev.setId(seq.incrementAndGet());
        data.put(ev.getId(), ev);
        return ev;
    }

    public List<Application> findAllApplication(){
        return new ArrayList<Application>(data.values());
    }

    public Optional<Application> findByApplicationId(Long id){
        return Optional.ofNullable(data.get(id));
    }

    public void deleteApplication(Long id) { data.remove(id); }
    public boolean applicationExists(Long id) { return data.containsKey(id); }
}
