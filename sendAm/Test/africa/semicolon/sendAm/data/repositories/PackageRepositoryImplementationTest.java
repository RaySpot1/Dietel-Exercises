package africa.semicolon.sendAm.data.repositories;

import africa.semicolon.sendAm.data.models.Package;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void repositoryFindByiDTest(){

        Package firstPackage = new Package();
        Package secondPackage = new Package();
        Package thirdPackage = new Package();
        packageRepository.save(firstPackage);
        packageRepository.save(secondPackage);
        packageRepository.save(thirdPackage);

        Package foundPackage = packageRepository.findById(2);

        assertEquals(secondPackage, foundPackage);
        assertEquals(2, foundPackage.getId());
    }

    @Test
    void deleteByIdTest(){
        saveThreePackages();

        packageRepository.delete(2);
        assertEquals(2, packageRepository.count());

    }

    private void saveThreePackages() {
        Package firstPackage = new Package();
        Package secondPackage = new Package();
        Package thirdPackage = new Package();

        packageRepository.save(firstPackage);
        packageRepository.save(secondPackage);
        packageRepository.save(thirdPackage);
    }

    @Test
    void findIdWorks_afterDeleteTest(){
        saveThreePackages();
        packageRepository.delete(2);

        Package foundPackage = packageRepository.findById(2);
        assertNull(foundPackage);
    }

    @Test
    void saveAfterDelete_givesCorrectPackageIdTest(){
        saveThreePackages();
        packageRepository.delete(1);
        Package savedPackage = packageRepository.save(new Package());
        assertEquals(4, savedPackage.getId());
    }

    @Test
    void deletePackageTest(){
        Package firstPackage = new Package();
        Package secondPackage = new Package();
        Package thirdPackage = new Package();

        packageRepository.save(firstPackage);
        packageRepository.save(secondPackage);
        packageRepository.save(thirdPackage);

        packageRepository.delete(secondPackage);

        assertEquals(2, packageRepository.count());
        assertNull(packageRepository.findById(2));

    }

    @Test
    void findAllTest(){
        saveThreePackages();
        List<Package> all = packageRepository.findAll();
        assertEquals(3, all.size());
    }

}