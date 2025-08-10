package studentpackage.student.portal.management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentpackage.student.portal.management.Dto.StudentmarkDTO;
import studentpackage.student.portal.management.Entity.StudentmarkEntity;
import studentpackage.student.portal.management.service.StudentmarkService;

import java.util.List;

@CrossOrigin
@RestController
public class Studentmarkcontroller {
    @Autowired
    private StudentmarkService StudentmarkService;
    @PostMapping("/add-mark")
    public StudentmarkEntity Addmark(@RequestBody StudentmarkDTO studentmarkDTO)
    {
        return StudentmarkService.Addmark(studentmarkDTO);
    }
    @GetMapping("/display-mark/{reg}")
    public List<StudentmarkDTO> Display_mark_api(@PathVariable(name = "reg") Long reg){
        return StudentmarkService.Display_Mark(reg);
    }
}
