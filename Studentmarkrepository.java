package studentpackage.student.portal.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentpackage.student.portal.management.Entity.StudentmarkEntity;

import java.util.List;


@Repository
public interface Studentmarkrepository extends JpaRepository<StudentmarkEntity,Long> {
    List<StudentmarkEntity> findByReg(Long reg);
}
