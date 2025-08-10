package studentpackage.student.portal.management.Entity;

import jakarta.persistence.*;

    @Entity
    @Table(name = "Studentmark")
    public class StudentmarkEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private Long reg;
        private String name;
        private String subjectname;
        private String subjectcode;
        private int mark;
        private String grade;
        private String result;
public  StudentmarkEntity(){

}
        public StudentmarkEntity(Long reg, String name, String subjectname, String subjectcode, int mark, String grade, String result) {
            this.reg = reg;
            this.name = name;
            this.subjectname = subjectname;
            this.subjectcode = subjectcode;
            this.mark = mark;
            this.grade = grade;
            this.result = result;
        }

        public Long getReg() {
            return reg;
        }

        public void setReg(Long reg) {
            this.reg = reg;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSubjectname() {
            return subjectname;
        }

        public void setSubjectname(String subjectname) {
            this.subjectname = subjectname;
        }

        public String getSubjectcode() {
            return subjectcode;
        }

        public void setSubjectcode(String subjectcode) {
            this.subjectcode = subjectcode;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }

