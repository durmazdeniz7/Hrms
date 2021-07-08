package Hrms.HrmsProject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "foreign_language")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForeignLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "language_name",nullable = false)
    private String languageName;

    @Column(name = "level",nullable = false)
    @Size(min = 1,max = 5)
    private int level;

    @ManyToOne()
    @JoinColumn(name = "cvTable_id")
    private CvTable cvTable;
}
