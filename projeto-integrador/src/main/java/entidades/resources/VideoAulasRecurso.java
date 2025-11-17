package recursos;

import java.util.List;

import entidades.VideoAulas;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("videoaula")
public class VideoAulasRecurso {
    @GET
    public List<VideoAulas> listar(){
        return VideoAulas.listAll(Sort.ascending("titulo"));
    }

    @POST
    @Transactional
    public void salvar(VideoAulas videoaula){
        videoaula.persist();
    }

}