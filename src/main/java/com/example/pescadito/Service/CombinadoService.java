package com.example.pescadito.Service;
import com.example.pescadito.Model.Combinado;
import com.example.pescadito.Repository.CombinadoRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CombinadoService {
    private final CombinadoRepository combinadoRepository;

    public CombinadoService(CombinadoRepository combinadoRepository){
        this.combinadoRepository = combinadoRepository;
    }

    //1. Listar todos los Combinados
    public List<Combinado> listarTodos(){
        return combinadoRepository.findAll();
    }

    //2. Obtener combinado por ID
    public Optional<Combinado> buscarPorId(long id){
        return combinadoRepository.findById(id);
    }

    //3. Crear Combinado
    public Combinado crearCombinado(Combinado combinado){
        return combinadoRepository.save(combinado);
    }

    //4. Actualizar Combinado
    public Combinado actualizarCombinado(long id, Combinado combinado){
        combinado.setId(id);
        return combinadoRepository.save(combinado);

    }

    //5. Eliminar Combinado
    public void eliminarCombinado(long id){
        combinadoRepository.deleteById(id);
    }
}






















