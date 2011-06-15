package com.imd.focusrx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imd.focusrx.entity.Attachment;
import com.imd.focusrx.repository.AttachmentRepository;
import com.imd.focusrx.service.AttachmentService;

@Service
public class AttachmentServiceImpl implements AttachmentService {

  @Autowired
  private AttachmentRepository attachmentRepository ;

  public Attachment add(Attachment attachment) {
    if(attachment==null){
      return null ;
    }
    return this.attachmentRepository.save(attachment);
  }

}
