package recursos;

import java.util.List;

import entidades.Professor;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("professor")
public class ProfessorRecurso {
    @GET
    public List<Professor> listar() {
        return Professor.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Professor professor) {
        professor.persist();
    }

    @DELETE
    @Path( "/{id}")
    @Transactional
    public void deletar(@PathParam("id") Integer id){
        Professor.deleteById(id);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void editar(@PathParam("id") Integer id, Professor professorAtualizado) {
        Professor professorExistente = Professor.findById(id);

            professorExistente.nome = professorAtualizado.nome; 
            professorExistente.cpf = professorAtualizado.cpf;
            professorExistente.email = professorAtualizado.email;
            professorExistente.senha = professorAtualizado.senha;
    }
}