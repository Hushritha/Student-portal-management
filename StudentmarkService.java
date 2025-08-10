package studentpackage.student.portal.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentpackage.student.portal.management.Dto.StudentDto;
import studentpackage.student.portal.management.Dto.StudentmarkDTO;
import studentpackage.student.portal.management.Entity.StudentEntity;
import studentpackage.student.portal.management.Entity.StudentmarkEntity;
import studentpackage.student.portal.management.Repository.Studentmarkrepository;

import java.util.ArrayList;
import java.util.List;

@Service
public  interface StudentmarkService {


    StudentmarkEntity mark(StudentmarkDTO h);

    StudentmarkEntity Addmark(StudentmarkDTO studentmarkDTO);

    List<StudentmarkDTO> Display_Mark(Long reg);
}
