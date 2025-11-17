package recursos;

import java.util.List;

import entidades.Resumos;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("resumo")
public class ResumosRecurso {
    @GET
    public List<Resumos> listar(){
        return Resumos.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Resumos resumos){
        resumos.persist();
    }
}