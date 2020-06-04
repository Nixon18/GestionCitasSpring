package com.quileia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.quileia.entity.EntidadCita;
import com.quileia.entity.EntidadMedico;
import com.quileia.entity.EntidadPaciente;
import com.quileia.model.Cita;
import com.quileia.model.Medico;
import com.quileia.model.Paciente;

@Configuration
public class Config {

	@Bean
	public Medico getMedico() {

		return new Medico();
	}

	@Bean
	public Paciente getPaciente() {

		return new Paciente();
	}

	@Bean
	public Cita getCita() {

		return new Cita();
	}

	@Bean
	public EntidadMedico getEntidadMedico() {

		return new EntidadMedico();
	}

	@Bean
	public EntidadPaciente getEntidadPaciente() {

		return new EntidadPaciente();
	}

	@Bean
	public EntidadCita getEntidadCita() {

		return new EntidadCita();
	}

}
