package com.example.pescadito.Repository;
import com.example.pescadito.Model.Combinado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombinadoRepository extends JpaRepository<Combinado, Long> {
}
