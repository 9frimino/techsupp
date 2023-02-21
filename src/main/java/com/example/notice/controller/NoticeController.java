package com.example.notice.controller;

import com.example.notice.dto.NoticeDTO;
import com.example.notice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {
    private final NoticeService noticeService;
    @GetMapping("/NoticeSave")
    public String saveForm() {
        return "NoticeSave";
    }

    @PostMapping("/NoticeSave")
    public String save(@ModelAttribute NoticeDTO noticeDto) {

        noticeService.save(noticeDto);
        return "ServiceMain";
    }

    @GetMapping("/")
    public String findAll(Model model) {
        List<NoticeDTO> noticeDTOList = noticeService.findAll();
        model.addAttribute("NoticeList", noticeDTOList);
        return "NoticeList";

    }
}
