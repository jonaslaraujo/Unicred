package br.com.jonaslaraujo.unicred.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BCMSG")
public class BcmsgModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer identEmissor;
    private Integer identDestinatario;
    private String domSist;
    private Long nuOp;
    private List<GrupoSeqModel> setGrupoSeqModelList;
}
