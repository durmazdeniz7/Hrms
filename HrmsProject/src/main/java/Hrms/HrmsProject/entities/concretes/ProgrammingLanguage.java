package Hrms.HrmsProject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "programing_language")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name",nullable = false)
   // @NotBlank()
    //@NotEmpty()
    private String programingName;

    @ManyToOne()
    @JoinColumn(name = "cvTable_id")
    private CvTable cvTable;

}
