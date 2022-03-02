package africa.semicolon.sendAm.data.repositories;

import africa.semicolon.sendAm.data.models.Package;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplementationTest {
    private  PackageRepository packageRepository;
    @BeforeEach
    void setUp(){
        packageRepository = new PackageRepositoryImplementation();
    }

    @Test
    void repositorySaveTest(){
//        given that theirs a package
        Package aPackage = new Package();

//        when saving into package
        Package savedPackage = packageRepository.save(aPackage);

//        assert that the package has an id
        assertEquals(1, savedPackage.getId());
//        assert that the count is 1
        assertEquals(1, packageRepository.count());
    }

}