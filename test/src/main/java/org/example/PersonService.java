package org.example;


import constants.UsersRole;
import db.IPersonDatabase;
import db.database.PersonDatabaseDatabaseHibernate;
import lombok.Data;
import lombok.NoArgsConstructor;
import objects.Person;
import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
@NoArgsConstructor
public class PersonService {
    private static PersonService instance;
    private final IPersonDatabase personDatabase = PersonDatabaseDatabaseHibernate.getInstance();

    public List<Person> getPersonList() {
        return personDatabase.getPersonList();
    }

    public Person getPersonById(int id) {

        Person personById;
        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getId() == id) {
                personById = getPersonList().get(i);
                return personById;
            }
        }
        return null;
    }


}


