package recursos;

import java.util.List;

import entidades.Turma;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("turma")
public class TurmaRecurso {
    @GET
    public List<Turma> listar(){
        return Turma.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Turma turma){
        turma.persist();
    }

}