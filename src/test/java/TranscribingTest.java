/*
 * Sphinx4 HTTP server
 *
 * Copyright @ 2016 Atlassian Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jitsi.sphinx4http.server.AudioTranscriber;

import java.io.FileInputStream;

/**
 * Tests whether the transcribing works
 */
public class TranscribingTest
{
    @org.junit.Test
    public static void main(String[] args) throws Exception
    {
        try(FileInputStream stream = new FileInputStream(TestFiles.TEST_FILE))
        {
            AudioTranscriber transcriber = new AudioTranscriber();
            transcriber.transcribe(stream);
        }
        catch (Exception e)
        {
            throw new Exception("Transcribing test has failed");
        }
    }
}
