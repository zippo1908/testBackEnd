package com.groupc.pt.service;

import java.util.List;

import com.groupc.pt.model.*;

public interface FieldsService {
//user
   long save(Fields userField);
   Fields getU(long id);
   List<Fields> userlist();
   void update(long id, Fields userField);
   void deleteU(long id);

}
