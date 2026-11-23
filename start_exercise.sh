#!/usr/bin/env bash
# Clone script for SSD Week 3 Lab: Code Documentation, Structure & Refactoring
# Organization: The-British-College-Nepal
# Repository: ssd-2026-week3-exercise

set -e

REPO_URL="https://github.com/The-British-College-Nepal/ssd-2026-week3-exercise.git"
TARGET_DIR="ssd-2026-week3-exercise"

echo "============================================================"
echo "🚀 SSD Week 3 Lab: Documentation, Structure & Refactoring"
echo "   Cloning starter repository..."
echo "============================================================"

if [ -d "$TARGET_DIR" ]; then
  echo "⚠️ Directory '$TARGET_DIR' already exists. Please remove or rename it before cloning."
  exit 1
fi

git clone "$REPO_URL" "$TARGET_DIR"

if [ $? -eq 0 ]; then
  echo ""
  echo "✅ Repository successfully cloned into '$TARGET_DIR'!"
  echo ""
  echo "👉 Next Steps:"
  echo "   1. cd $TARGET_DIR"
  echo "   2. git checkout -b feature/step1-clean-code"
  echo "   3. Open the project in IntelliJ IDEA or Eclipse."
  echo "============================================================"
else
  echo "❌ Failed to clone repository. Check your network connection and GitHub permissions."
fi
