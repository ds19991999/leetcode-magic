#!/usr/bin/env python
# -*- coding:utf-8 -*-


import os, re


class LeetCodeData(object):
    def __init__(self):
        self.url = ""
        self.title = ""
        self.solution_path = ""
        self.test_path = ""
        self.id = 0


def get_leetcode_data(root, pattern):
    for file_name in os.listdir(root):
        file_path = os.path.join(root, file_name)
        if ("weekly" in file_name): continue
        with open(file_path, "r", encoding="utf-8") as f:
            content = f.read()
            url = re.findall(r''+pattern, content)
            if (len(url) > 0):
                leet_code_data = LeetCodeData()
                leet_code_data.url = url[0]
                leet_code_data.solution_path = file_path
                leet_code_data.test_path = file_path.replace("main", "test").replace(".java", "Test.java")
                leet_code_data.id = re.findall(r'\d+', file_name)[0]
                leet_code_data.title = leet_code_data.url.split("/")[-2]
                yield leet_code_data


def write_read_me(file_path, root, pattern):
    readme_head = "# LeetCode Magic \n\n"
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(readme_head)
        f.write("| ID 🆔 | Titile 🎗️ | Solution 🔓 | UT ✅ |\n")
        f.write("| ------ | ----------------- | --------------------- | ---------------------- |\n")
        for leet_code_data in get_leetcode_data(root, pattern):
            f.write(
                "| [{id}]({url}) | {title} | [{solution_name}]({solution_path}) | [{test_name}]({test_path}) |\n".format(
                    id=leet_code_data.id,
                    url=leet_code_data.url,
                    title=leet_code_data.title,
                    solution_name=leet_code_data.solution_path.split("/")[-1],
                    solution_path=leet_code_data.solution_path,
                    test_name=leet_code_data.test_path.split("/")[-1],
                    test_path=leet_code_data.test_path
                )
            )


if __name__ == "__main__":
    file_path = "README.md"
    root="src/main/java/leetcode/hackhub/me/"
    pattern='https://leetcode-cn.com/problems/[^\s<>"]+'
    write_read_me(file_path, root, pattern)
