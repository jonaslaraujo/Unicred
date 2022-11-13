package br.com.jonaslaraujo.unicred.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SLC0001")
public class Slc0001Model implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codMsg;
    private Long numCtrlSlc;
    private Integer Ispbif;
    private String tpInf;
    private Timestamp dtHrSlc;
    private Date dtMovto;
}
