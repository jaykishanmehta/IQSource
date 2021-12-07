package com.interview.junction.IQSource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.junction.IQSource.model.Tag;
import com.interview.junction.IQSource.service.TagRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/iq-services", produces = { MediaType.APPLICATION_JSON_VALUE })
@Api(value="tags-manager", description="Operations pertaining to tags for question mapping")
public class TagController {
	
	@Autowired
	private TagRepository tagRepository;
	
	@GetMapping(value = "/tags")
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }
 
    @PostMapping("/tags")
    Tag createOrSaveTag(@RequestBody Tag newTag) {
        return tagRepository.save(newTag);
    }
 
    @GetMapping("/tags/{id}")
    Tag getTagById(@PathVariable Integer id) {
        return tagRepository.findById(id).get();
    }
 
    @PutMapping("/tags/{id}")
    Tag updateTag(@RequestBody Tag newTag, @PathVariable Integer id) {
 
        return tagRepository.findById(id).map(t -> {
            t.setName(newTag.getName());
            t.setDesc(newTag.getDesc());
            return tagRepository.save(t);
        }).orElseGet(() -> {
            newTag.setId(id);
            return tagRepository.save(newTag);
        });
    }
 
    @DeleteMapping("/tags/{id}")
    void deleteTag(@PathVariable Integer id) {
        tagRepository.deleteById(id);
    }
}
