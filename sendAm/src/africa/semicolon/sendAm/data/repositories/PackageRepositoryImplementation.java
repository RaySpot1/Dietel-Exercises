package africa.semicolon.sendAm.data.repositories;
import africa.semicolon.sendAm.data.models.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImplementation implements PackageRepository {
    private List<Package> db = new ArrayList<>();
    private int Id = 0;

    @Override
    public Package save(Package aPackage){
        int Id = generateId();
        aPackage.setId(Id);
        db.add(aPackage);
//        return db.get(Id-1);
        return aPackage;
    }

    private int generateId(){
        return ++this.Id;
//        or return ++id
//            db.size()+1
    }

    @Override
    public Package findById(int id){
        for(Package aPackage: db){
            if(aPackage.getId()==id)
                return aPackage;
        }
        return null;
    }

    @Override
    public void delete(Package aPackage) {
        db.remove(aPackage);
    }

    @Override
    public void delete(int id){
        Package foundPackage = findById(id);
        delete(foundPackage);
    }

    @Override
    public List<Package> findAll() {
        return db;
    }

    @Override
    public int count(){
        return db.size();
    }
}
