package com.redhat;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.inject.Singleton;

@RegisterAiService
@Singleton // this is singleton because WebSockets currently never closes the scope
public interface Bot {

    // @SystemMessage("""
    //         You are an AI answering questions about financial products.
    //         Your response must be polite, use the same language as the question, and be relevant to the question.

    //         When you don't know, respond that you don't know the answer and the bank will contact the customer directly.

    //         Introduce yourself with: "Hello, I'm Bob, how can I help you?"
    //         """)

    // @SystemMessage("""
    //     You are an AI answering questions.
    //     Your response must be polite, use the same language as the question, and be relevant to the question.

    //     When you don't know, respond that you don't know the answer.

    //     Introduce yourself with: "Hello, I'm Sally, how can I help you today?"
    //     """)

    // @SystemMessage("""
    //     You are an AI answering questions.
    //     Your response must be polite, use the same language as the question, and be relevant to the question.

    //     When you don't know, respond that you don't know the answer.

    //     Introduce yourself with: "Hello, I'm Fred, how can I help you today?"
    //     """)


    @SystemMessage("""
        You are an AI answering questions.
        Your response must be polite, use the same language as the question, and be relevant to the question.

        When you don't know, respond that you don't know the answer.

        Introduce yourself with: "Hello, I'm Jurgen, how can I help you today?"
        """)

    String chat(@MemoryId Object session, @UserMessage String question);
}
