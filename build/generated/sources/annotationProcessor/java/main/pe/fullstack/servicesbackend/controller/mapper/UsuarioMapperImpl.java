package pe.fullstack.servicesbackend.controller.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.fullstack.servicesbackend.controller.auth.UserInfoDetails;
import pe.fullstack.servicesbackend.controller.request.CreateUsuarioRequest;
import pe.fullstack.servicesbackend.controller.response.UsuarioResponse;
import pe.fullstack.servicesbackend.domain.business.Usuario;
import pe.fullstack.servicesbackend.repository.UsuarioEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-20T22:31:49-0500",
    comments = "version: 1.7.0.Beta1, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.7.1.jar, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario convertFromEntity(UsuarioEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        if ( entity.getIdUsuario() != null ) {
            usuario.idUsuario( entity.getIdUsuario() );
        }
        if ( entity.getNombres() != null ) {
            usuario.nombres( entity.getNombres() );
        }
        if ( entity.getApellidos() != null ) {
            usuario.apellidos( entity.getApellidos() );
        }
        if ( entity.getDni() != null ) {
            usuario.dni( entity.getDni() );
        }
        if ( entity.getEmail() != null ) {
            usuario.email( entity.getEmail() );
        }
        if ( entity.getTelefono() != null ) {
            usuario.telefono( entity.getTelefono() );
        }
        if ( entity.getEnabled() != null ) {
            usuario.enabled( entity.getEnabled() );
        }
        if ( entity.getLastSignIn() != null ) {
            usuario.lastSignIn( entity.getLastSignIn() );
        }
        if ( entity.getCreatedBy() != null ) {
            usuario.createdBy( entity.getCreatedBy() );
        }
        if ( entity.getCreatedAt() != null ) {
            usuario.createdAt( entity.getCreatedAt() );
        }
        if ( entity.getUpdatedBy() != null ) {
            usuario.updatedBy( entity.getUpdatedBy() );
        }
        if ( entity.getUpdatedAt() != null ) {
            usuario.updatedAt( entity.getUpdatedAt() );
        }
        if ( entity.getClave() != null ) {
            usuario.clave( entity.getClave() );
        }

        return usuario.build();
    }

    @Override
    public List<Usuario> convertFromEntity(List<UsuarioEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( entities.size() );
        for ( UsuarioEntity usuarioEntity : entities ) {
            list.add( convertFromEntity( usuarioEntity ) );
        }

        return list;
    }

    @Override
    public UsuarioResponse convert(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioResponse.UsuarioResponseBuilder usuarioResponse = UsuarioResponse.builder();

        if ( usuario.getIdUsuario() != null ) {
            usuarioResponse.idUsuario( usuario.getIdUsuario() );
        }
        if ( usuario.getNombres() != null ) {
            usuarioResponse.nombres( usuario.getNombres() );
        }
        if ( usuario.getApellidos() != null ) {
            usuarioResponse.apellidos( usuario.getApellidos() );
        }
        if ( usuario.getDni() != null ) {
            usuarioResponse.dni( usuario.getDni() );
        }
        if ( usuario.getEmail() != null ) {
            usuarioResponse.email( usuario.getEmail() );
        }
        if ( usuario.getTelefono() != null ) {
            usuarioResponse.telefono( usuario.getTelefono() );
        }
        if ( usuario.getEnabled() != null ) {
            usuarioResponse.enabled( usuario.getEnabled() );
        }
        if ( usuario.getLastSignIn() != null ) {
            usuarioResponse.lastSignIn( usuario.getLastSignIn() );
        }
        if ( usuario.getCreatedBy() != null ) {
            usuarioResponse.createdBy( usuario.getCreatedBy() );
        }
        if ( usuario.getCreatedAt() != null ) {
            usuarioResponse.createdAt( usuario.getCreatedAt() );
        }
        if ( usuario.getUpdatedBy() != null ) {
            usuarioResponse.updatedBy( usuario.getUpdatedBy() );
        }
        if ( usuario.getUpdatedAt() != null ) {
            usuarioResponse.updatedAt( usuario.getUpdatedAt() );
        }

        return usuarioResponse.build();
    }

    @Override
    public List<UsuarioResponse> convert(List<Usuario> usuarios) {
        if ( usuarios == null ) {
            return null;
        }

        List<UsuarioResponse> list = new ArrayList<UsuarioResponse>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( convert( usuario ) );
        }

        return list;
    }

    @Override
    public Usuario convert(CreateUsuarioRequest request, UserInfoDetails userInfoDetails) {
        if ( request == null && userInfoDetails == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        if ( request != null ) {
            List<String> list = request.getRoles();
            if ( list != null ) {
                usuario.roles( new ArrayList<String>( list ) );
            }
            if ( request.getNombres() != null ) {
                usuario.nombres( request.getNombres() );
            }
            if ( request.getApellidos() != null ) {
                usuario.apellidos( request.getApellidos() );
            }
            if ( request.getDni() != null ) {
                usuario.dni( request.getDni() );
            }
            if ( request.getEmail() != null ) {
                usuario.email( request.getEmail() );
            }
            if ( request.getTelefono() != null ) {
                usuario.telefono( request.getTelefono() );
            }
            if ( request.getClave() != null ) {
                usuario.clave( request.getClave() );
            }
        }
        if ( userInfoDetails != null ) {
            if ( userInfoDetails.getUsuarioId() != null ) {
                usuario.createdBy( userInfoDetails.getUsuarioId() );
            }
            usuario.enabled( userInfoDetails.isEnabled() );
        }

        return usuario.build();
    }

    @Override
    public UsuarioEntity convertFromBusiness(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioEntity.UsuarioEntityBuilder usuarioEntity = UsuarioEntity.builder();

        if ( usuario.getIdUsuario() != null ) {
            usuarioEntity.idUsuario( usuario.getIdUsuario() );
        }
        if ( usuario.getNombres() != null ) {
            usuarioEntity.nombres( usuario.getNombres() );
        }
        if ( usuario.getApellidos() != null ) {
            usuarioEntity.apellidos( usuario.getApellidos() );
        }
        if ( usuario.getDni() != null ) {
            usuarioEntity.dni( usuario.getDni() );
        }
        if ( usuario.getEmail() != null ) {
            usuarioEntity.email( usuario.getEmail() );
        }
        if ( usuario.getTelefono() != null ) {
            usuarioEntity.telefono( usuario.getTelefono() );
        }
        if ( usuario.getEnabled() != null ) {
            usuarioEntity.enabled( usuario.getEnabled() );
        }
        if ( usuario.getLastSignIn() != null ) {
            usuarioEntity.lastSignIn( usuario.getLastSignIn() );
        }
        if ( usuario.getCreatedBy() != null ) {
            usuarioEntity.createdBy( usuario.getCreatedBy() );
        }
        if ( usuario.getCreatedAt() != null ) {
            usuarioEntity.createdAt( usuario.getCreatedAt() );
        }
        if ( usuario.getUpdatedBy() != null ) {
            usuarioEntity.updatedBy( usuario.getUpdatedBy() );
        }
        if ( usuario.getUpdatedAt() != null ) {
            usuarioEntity.updatedAt( usuario.getUpdatedAt() );
        }
        if ( usuario.getClave() != null ) {
            usuarioEntity.clave( usuario.getClave() );
        }

        return usuarioEntity.build();
    }
}
