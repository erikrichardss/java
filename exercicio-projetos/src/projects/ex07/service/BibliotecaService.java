package projects.ex07.service;

import projects.ex07.domain.Emprestimo;
import projects.ex07.domain.Material;
import projects.ex07.domain.Usuario;
import projects.ex07.enums.StatusEmprestimo;

import java.util.*;

public class BibliotecaService {

    List<Usuario> usuarios = new ArrayList<>();
    List<Material> materiais = new ArrayList<>();
    List<Emprestimo> emprestimos = new ArrayList<>();
    Set<Usuario> usuariosSet = new HashSet<>();
    Map<Usuario, List<Emprestimo>> listMap = new HashMap<>();

    public void cadastrarUsuarios(Usuario u) {

        usuariosSet.add(u);
        boolean isAdicionado = usuariosSet.add(u);

        if (isAdicionado) {

            this.usuarios.add(u);
        }
    }

    public void cadastrarMaterial(Material material) {

        materiais.add(material);
    }

    public void removerEmprestimosFinalizados() {

        Iterator<Emprestimo> emprestimoIterator = emprestimos.iterator();

        while (emprestimoIterator.hasNext()) {

            if (emprestimoIterator.next().getStatusEmprestimo().equals(StatusEmprestimo.FINALIZADO)) {

                emprestimoIterator.remove();
            }
        }
    }

    public void ordenarLivros() {

        materiais.sort(Comparator.comparing(m -> m.getTitulo()));
    }

    public void associarUsuarioAoEmprestimo() {

        for (Usuario usuario : this.usuarios) {

            List<Emprestimo> emprestimoDoUsuario = new ArrayList<>();

            if (emprestimoDoUsuario.size() == usuario.getTipoUsuario().getLimiteEmprestimo()) {

                throw new IllegalArgumentException("Limite excedido");
            }

            for (Emprestimo emprestimo : emprestimoDoUsuario) {

                if (emprestimo.getUsuario().equals(usuario)) {

                    emprestimoDoUsuario.add(emprestimo);
                }

                if (emprestimo.getStatusEmprestimo().equals(StatusEmprestimo.FINALIZADO)) {

                    emprestimoDoUsuario.remove(emprestimo);
                }
            }

            this.listMap.put(usuario, emprestimoDoUsuario);
        }
    }
}
