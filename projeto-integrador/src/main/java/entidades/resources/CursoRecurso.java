package recursos;

import java.util.List;

import entidades.Curso;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("curso")
public class CursoRecurso {
    @GET
    public List<Curso> listar(){
        return Curso.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Curso curso){
        curso.persist();
    }

}