package projects.ex09.repository;

import projects.ex09.domain.Materials;

import java.util.ArrayList;
import java.util.List;

public class MaterialsRepository implements Repository<Materials> {

    private List<Materials> materials = new ArrayList<>();

    public void finByTitle(String title) {

        materials.stream()
                .filter(m -> m.getTitle().equals(title))
                .forEach(System.out::println);
    }

    @Override
    public void saveElement(Materials material) {

        materials.add(material);
    }

    @Override
    public void listAll() {
        materials.forEach(System.out::println);
    }

    @Override
    public Materials searchById(int id) {

        return materials.stream()
                .filter(m -> m.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void removeElement(Materials material) {

        materials.remove(material);
    }
}
