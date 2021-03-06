/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2015-2021 The Sdkman Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

Path path = Paths.get(basedir.toString(), 'build.log')
String buildLog = new String(Files.readAllBytes(path))
assert buildLog.contains('http://localhost:8081/release')
assert buildLog.contains('"candidate":"it"')
assert buildLog.contains('"version":"1.0.0-SNAPSHOT"')
assert buildLog.contains('"url":"https://host/it-1.0.0-SNAPSHOT.zip"')
assert buildLog.contains('http://localhost:8081/default')
assert buildLog.contains('http://localhost:8081/announce/struct')
assert buildLog.contains('Sdk vendor operation successful')