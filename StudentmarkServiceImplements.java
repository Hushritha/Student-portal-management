package studentpackage.student.portal.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentpackage.student.portal.management.Dto.StudentmarkDTO;
import studentpackage.student.portal.management.Entity.StudentmarkEntity;
import studentpackage.student.portal.management.Repository.Studentmarkrepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentmarkServiceImplements implements StudentmarkService {
    @Autowired
    private Studentmarkrepository callquery;
@Override
public StudentmarkEntity mark(StudentmarkDTO h){
        StudentmarkEntity store = new StudentmarkEntity(h.getReg(),h.getName(),h.getSubjectname(),h.getSubjectcode(),h.getMark(),h.getGrade(),h.getResult());
        return callquery.save(store);
    }
    @Override
    public StudentmarkEntity Addmark(StudentmarkDTO studentmarkDTO){
        StudentmarkEntity storethedata= new StudentmarkEntity(studentmarkDTO.getReg(),studentmarkDTO.getName(),
                studentmarkDTO.getSubjectname(),studentmarkDTO.getSubjectcode(),studentmarkDTO.getMark(),
                studentmarkDTO.getGrade(),studentmarkDTO.getResult());
        return callquery.save(storethedata);
    }
    @Override
    public List<StudentmarkDTO> Display_Mark(Long reg){
        List<StudentmarkEntity> getdata=callquery.findByReg(reg);
        List<StudentmarkDTO> transfer = new ArrayList<>();
        for(StudentmarkEntity getdates:getdata)
        {
            StudentmarkDTO setdata= new StudentmarkDTO();
            setdata.setReg(getdates.getReg());
            setdata.setName((getdates.getName()));
            setdata.setSubjectname((getdates.getSubjectname()));
            setdata.setSubjectcode((getdates.getSubjectcode()));
            setdata.setMark(getdates.getMark());
            setdata.setGrade(getdates.getGrade());
            setdata.setResult((getdates.getResult()));
            transfer.add(setdata);
        }
        return transfer;
    }
}

