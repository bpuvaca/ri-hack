package babel.backend.controller;

import babel.backend.model.TrashContainer;
import babel.backend.service.TrashContainerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/trash-containers")
public class TrashContainerController {
    private final TrashContainerService trashContainerService;


    public TrashContainerController(TrashContainerService trashContainerService) {
        this.trashContainerService = trashContainerService;
    }

    @GetMapping
    public List<TrashContainer> getAllTrashContainers(){
        return trashContainerService.getAllTrashContainers();
    }

    @GetMapping(path="{id}")
    public TrashContainer getTrashContainerById(@PathVariable("id") Long id) {
        return trashContainerService.getTrashContainerById(id);
    }

    @PostMapping
    public TrashContainer insertTrashContainer(@RequestBody TrashContainer trashContainer) {
        return trashContainerService.insertTrashContainer(trashContainer);
    }

    @DeleteMapping(path="{id}")
    public void deleteTrashContainer(@PathVariable("id") Long id) {
        trashContainerService.deleteTrashContainer(id);
    }

}
