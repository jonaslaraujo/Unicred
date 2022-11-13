package br.com.jonaslaraujo.unicred.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GRUPOSLC001LIQUID")
public class GrupoSlc001LiquidModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dtLiquid;
    private Integer numSeqCicloLiquid;

    @ManyToOne
    @JoinColumn(name = "idSlc001")
    private Slc0001Model slc0001Model;
}
